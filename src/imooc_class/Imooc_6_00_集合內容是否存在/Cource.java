package imooc_class.Imooc_6_00_集合內容是否存在;

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0: name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // 判斷記憶體是否一樣
        if (this == null) return false; // 判斷是否為空，空对象不能调用 equals, 会抛出异常。
        if (!(obj instanceof Cource)) return false; // 判斷是否類型一樣
        Cource cource = (Cource) obj;

        if(this.name == null){ // 判斷當前名字是否為空
            if(cource.name == null)
                return true;
            else
                return false;
        } else {
            if(this.name.equals(cource.getName()))
                return true;
            else
                return false;
        }
    }

    @Override
    public String toString(){
        return id + ":" + name;
    }

}
