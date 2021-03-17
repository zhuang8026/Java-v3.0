package imooc_class.Imooc_4_11_HashSet;

/* 課程類 */
public class Cource {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String courceId) {
        this.id = courceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String courceName) {
        this.name = courceName;
    }

    public String toString(){
        return id + ":" + name;
    }

//    public Cource(){}
}
