package initiateBoot.app.common.response;

class ServerErrorMessage {
    private String severity;

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public String getConstraint() {
        return constraint;
    }

    public void setConstraint(String constraint) {
        this.constraint = constraint;
    }

    public String getRoutine() {
        return routine;
    }

    public void setRoutine(String routine) {
        this.routine = routine;
    }

    public String getInternalQuery() {
        return internalQuery;
    }

    public void setInternalQuery(String internalQuery) {
        this.internalQuery = internalQuery;
    }

    public String getInternalPosition() {
        return internalPosition;
    }

    public void setInternalPosition(String internalPosition) {
        this.internalPosition = internalPosition;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getSqlstate() {
        return sqlstate;
    }

    public void setSqlstate(String sqlstate) {
        this.sqlstate = sqlstate;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    private String detail;
    private String hint;
    private String datatype;
    private String constraint;
    private String routine;
    private String internalQuery;
    private String internalPosition;
    private String schema;
    private String sqlstate;
    private String column;
    private String line;
    private String position;
    private String where;
    private String message;
    private String file;
    private String table;
}


