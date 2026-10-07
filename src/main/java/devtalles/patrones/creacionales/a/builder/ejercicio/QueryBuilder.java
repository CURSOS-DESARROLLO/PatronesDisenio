package devtalles.patrones.creacionales.a.builder.ejercicio;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

//! Tarea: crear un QueryBuilder para construir consultas SQL

/**
 * Debe de tener los siguientes métodos:
 * - constructor(table: string)
 * - select(fields: string[]): QueryBuilder -- si no se pasa ningún campo, se seleccionan todos con el (*)
 * - where(condition: string): QueryBuilder - opcional
 * - orderBy(field: string, order: string): QueryBuilder - opcional
 * - limit(limit: number): QueryBuilder - opcional
 * - execute(): string - retorna la consulta SQL
 * <p>
 * * Ejemplo de uso:
 * const usersQuery = new QueryBuilder("users") // users es el nombre de la tabla
 * .select("id", "name", "email")
 * .where("age > 18")
 * .where("country = 'Cri'")
 * .orderBy("name", "ASC")
 * .limit(10)
 * .execute();
 * <p>
 * console.log('Consulta: ', usersQuery);
 * // Select id, name, email from users where age > 18 and country = 'Cri' order by name ASC limit 10;
 */
public final class QueryBuilder {
    private final String table;
    private final String[] fields;
    private final String[] conditions;
    private final String[] orderFields;
    private final int limitCount;

    private QueryBuilder(String table, String[] fields, String[] conditions, String[] orderFields, int limitCount) {
        this.table = table;
        this.fields = fields;
        this.conditions = conditions;
        this.orderFields = orderFields;
        this.limitCount = limitCount;
    }

    private String joinArrayString(String wordToJoin, String... array) {
        StringBuilder sb = new StringBuilder();

        int arrayLength = array.length;

        for (int i = 0; i < arrayLength; i++) {
            if (i == arrayLength - 1) {
                sb.append(String.format("%s ", array[i]));
            } else {
                sb.append(String.format("%s %s ", array[i], wordToJoin));
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        Predicate<String[]> isFalsyArray = array -> array == null || array.length <= 0;

        final StringBuffer stringBuffer = new StringBuffer("SELECT ");

        if (!isFalsyArray.test(this.fields)) {
            stringBuffer.append(joinArrayString(",", fields));
        } else {
            stringBuffer.append(" * ");
        }

        stringBuffer.append("FROM ").append(table);

        if (!isFalsyArray.test(conditions)) {
            stringBuffer.append(" WHERE ");
            stringBuffer.append(joinArrayString("AND", conditions));

        }

        if (!isFalsyArray.test(orderFields)) {
            stringBuffer.append("ORDER BY ");
            stringBuffer.append(joinArrayString(",", orderFields));
        }

        stringBuffer.append(limitCount <= 0 ? "" : " LIMIT " + limitCount);
        stringBuffer.append(';');
        return stringBuffer.toString();
    }

    public static Builder builder(String table) {
        return new Builder(table);
    }

    public static class Builder {
        private String table;
        private String[] fields = {};
        private String[] conditions = {};
        private String[] orderFields = {};
        private int limitCount;

        private Builder(String table) {
            this.table = table.trim();
        }

        private boolean isArrayNully(String[] array) {
            return array.length <= 0 || array == null;
        }

        private String[] concatArrays(String[] array, String[] array2) {
            return Stream.concat(Arrays.stream(array), Arrays.stream(array2)).toArray(String[]::new);
        }

        public Builder select(String... fields) {
            this.fields = isArrayNully(this.fields) ? fields : concatArrays(this.fields, fields);

            return this;
        }

        public Builder where(String... conditions) {
            this.conditions = isArrayNully(this.conditions) ? conditions : concatArrays(this.conditions, conditions);
            return this;
        }

        public Builder orderBy(String... orderFields) {
            this.orderFields = isArrayNully(this.orderFields) ? orderFields : concatArrays(this.orderFields, orderFields);
            return this;
        }

        public Builder limit(int limitCount) {
            this.limitCount = limitCount;
            return this;
        }

        public QueryBuilder execute() {
            return new QueryBuilder(table, fields, conditions, orderFields, limitCount);
        }

    }
}
