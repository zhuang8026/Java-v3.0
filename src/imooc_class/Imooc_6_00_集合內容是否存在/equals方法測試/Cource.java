package imooc_class.Imooc_6_00_集合內容是否存在.equals方法測試;

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
    public boolean equals(Object obj) {
        if (this == obj) return true; // 判斷內容是否一樣
        if (this == null) return false; // 判斷是否為空，空对象不能调用 equals, 会抛出异常。
        if (!(obj instanceof Cource)) return false; // 判斷是否類型一樣
        Cource cource = (Cource) obj;

        boolean isNameEqual = false;
        if(this.name == null){ // 判斷當前名字是否為空
            if(cource.name == null)
                isNameEqual =  true;
        } else {
            if(this.name.equals(cource.getName()))
                isNameEqual =  true;
        }

        boolean isIdEqual = false;
        if(this.id == null){ // 判斷當前名字是否為空
            if(cource.id == null)
                isIdEqual =  true;
        } else {
            if(this.id.equals(cource.getId()))
                isIdEqual = true;
        }

        return isNameEqual && isIdEqual;
    }

    @Override
    public String toString(){
        return id + ":" + name;
    }

}
