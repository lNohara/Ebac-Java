package br.com.lnohara.mod19.aula04.dao.generic;

import Modulo_17.Aula03.cadastro.SingletonMap;
import br.com.lnohara.mod19.aula04.annotation.TipoChave;
import br.com.lnohara.mod19.aula04.domain.Persistente;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;

public abstract class GenericDAO<T extends Persistente> implements IGenericDAO<T> {

    //protected Map<Class, Map<Long, T>> map = new HashMap<>();

    /**
     * Necessário utilizar Singleton para ter apenas um MAP no sistema
     */
    private SingletonMap singletonMap;

    public abstract Class<T> getTipoClasse();

    public abstract void atualiarDados(T entity, T entityCadastrado);

    public GenericDAO() {
        this.singletonMap = SingletonMap.getInstance();
    }

    public Long getChave(T entity) {
        Field[] fields = entity.getClass().getDeclaredFields();
        for(Field fild : fields) {
            if(fild.isAnnotationPresent(TipoChave.class)){
                TipoChave tipoChave = fild.getAnnotation(TipoChave.class);
                String nomeMetodo = tipoChave.value();
                Method method = null;
                try {
                    method = entity.getClass().getMethod(nomeMetodo);
                    Long value = (Long) method.invoke(entity);
                    return value;
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    public Boolean cadastrar(T entity) {
        //Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        Map<Long, T> mapaInterno = (Map<Long, T>) this.singletonMap.getMap().get(getTipoClasse());
        Long chave = getChave(entity);
        if (mapaInterno.containsKey(chave)) {
            return false;
        }
        mapaInterno.put(chave, entity);
        return true;
    }

    @Override
    public void excluir(Long valor) {
        //Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        Map<Long, T> mapaInterno = (Map<Long, T>) this.singletonMap.getMap().get(getTipoClasse());
        T objetoCadastrado = mapaInterno.get(valor);
        if (objetoCadastrado != null) {
            mapaInterno.remove(valor, objetoCadastrado);
        }
    }

    @Override
    public void alterar(T entity) {
        //Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        Long chave = getChave(entity);
        Map<Long, T> mapaInterno = (Map<Long, T>) this.singletonMap.getMap().get(getTipoClasse());
        T objetoCadastrado = mapaInterno.get(chave);
        if (objetoCadastrado != null) {
            atualiarDados(entity, objetoCadastrado);
        }
    }

    @Override
    public T consultar(Long valor) {
        //Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        Map<Long, T> mapaInterno = (Map<Long, T>) this.singletonMap.getMap().get(getTipoClasse());
        return mapaInterno.get(valor);
    }

    @Override
    public Collection<T> buscarTodos() {
        //Map<Long, T> mapaInterno = this.map.get(getTipoClasse());
        Map<Long, T> mapaInterno = (Map<Long, T>) this.singletonMap.getMap().get(getTipoClasse());
        return mapaInterno.values();
    }
}
