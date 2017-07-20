package models;

import org.apache.commons.lang3.StringUtils;
import play.db.jpa.JPA;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.persistence.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class ModelBase {

    // TODO JPAの利用をやめてJPAApiを利用するようにする
    @Inject
    protected JPAApi api;

    public void register() {
        JPA.em().persist(this);
    }

    public void updater() {
        JPA.em().merge(this);
    }

    public static <T> Optional<T> findByPk(Class<T> entityClass, Object primaryKey) {
        return Optional.ofNullable(JPA.em().find(entityClass, primaryKey));
    }
    public static <T> List<T> all(Class<T> entityClass) {
        return JPA.em().createQuery("from " + entityClass.getSimpleName(), entityClass).getResultList();
    }
    public static <T> List<T> find(Class<T> entityClass, Map<String,Object> params) {
        String where = params.entrySet().stream().map(e -> {
            return e.getKey() + " = '" + e.getValue() + "'";
        }).collect(Collectors.joining(" and "));
        return JPA.em().createQuery("from " + entityClass.getSimpleName() + " where " + where , entityClass).getResultList();
    }
    public static <T> List<T> findWhere(Class<T> entityClass, String where) {
        if (StringUtils.isBlank(where)) {
            return all(entityClass);
        }
        return JPA.em().createQuery("from " + entityClass.getSimpleName() + " where " + where , entityClass).getResultList();
    }
}
