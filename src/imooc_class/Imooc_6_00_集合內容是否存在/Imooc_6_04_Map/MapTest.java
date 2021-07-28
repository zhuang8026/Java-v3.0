package imooc_class.Imooc_6_00_集合內容是否存在.Imooc_6_04_Map;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

    /** 創建Map裝資料 */
    /* 創建studentMap類的Map對象 */
    public Map<String, Student> studentMap = new HashMap<String, Student>();

    /** 添加 put() */
    public void putTest(){
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("請輸入學生Id：");
            String ID = scanner.next();
            // 先判斷 是否有 id
            Student st = studentMap.get(ID); // 有可能是空

            Student stt = new Student();

            if(st == null){
                // 提示輸入學生姓名
                System.out.println("請輸入學生姓名：");
                String name = scanner.next();

                stt.setId(ID);
                stt.setName(name);

                Student newStudent = stt;

                // put(key, value)
                studentMap.put(ID, newStudent);

                System.out.println("成功添加: "+ studentMap.get(ID).getName());

                i++;
            } else {
                System.out.println("該學生ID已被使用");
                continue;
            }
        }
    }

    /** 取得所有的key KeySet() -> key */
    public void keySetTest() {
        // 通過keySet,返回Map中的所有 key 的Set集合
        Set<String> ks = studentMap.keySet(); // 取得所有的key

        // 取得 Map 的size
        System.out.println("Map的容量:" + studentMap.size());

        // 迴圈KeySet,取得每一個key,在用get()取得每一個key值對應的內容
        for(String sid: ks){
            Student st = studentMap.get(sid);

            if(st != null){
                System.out.println("學生" + st.getName());
            }

        }
    }

    /** 刪除 remove() */
    public void removeTest() {
        // 輸入要刪除的學生id
        System.out.println("請輸入要刪除的學生id:");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();

        while (true){
            // 判斷是否有一樣的id
            Student studentsId = studentMap.get(id);
            if(studentsId == null) {
                // 沒有id
                System.out.println("該id不存在");
                continue;
            } else {
                studentMap.remove(id);
                System.out.println("刪除學生：" + studentsId.getName());
                break;
            }
        }
    }

    /** 查詢 Map迴圈 entrySet() -> key, value  */
    public void entrySetTest() {
        // 通過 entrySet 方法，返回map的鍵值對
//        Set<Entry<String, Student>> entrySet = studentMap.entrySet();
        System.out.println("還剩下：");
        for(Entry<String, Student> entry : studentMap.entrySet()){
            System.out.println("key:" + entry.getKey());
            System.out.println("value:"+ entry.getValue().getName()); // entry.getValue() == Student
                                                                      // entry.getValue() 是一個類
                                                                      // entry.getValue() 可以直接使用Sutdent中的方法和變數
        }
    }

    /** 修改 put */
    public void fixedTest() {
        System.out.println("請輸入要修改的id:");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        while (true) {
            // 檢查是否有一樣的id
            Student stId = studentMap.get(id);

            Student stt = new Student();

            if(stId == null){
                System.out.println("沒有找到id為'" + id + "'的學生");
                continue;
            } else {
                System.out.println("請輸入新的學生姓名：");
                String name = scanner.next();
                stt.setId(id);
                stt.setName(name);
                studentMap.put(id, stt);
                System.out.println("修改成功");
                System.out.println("目前還剩下：" + studentMap);
                break;
            }
        }
    }

    /** 測試Map中，是否含某個key值或某個value值 */
    public  void testContaindKeyOrValue(){
        // containsKey()方法，來判斷是否包含某個key值
        // containsValue()方法，來判斷是否包含某個Value值

        System.out.println("請輸入要查詢的學生ID:");
        Scanner scanner1 = new Scanner(System.in);
        String id = scanner1.next();
        System.out.println("你輸入的學生ID為：" + id + ", 在學生表格中是否存在？：" + studentMap.containsKey(id));

        if(studentMap.containsKey(id)){
            System.out.println("已找到相對應的學生：" + studentMap.get(id).getName());
            System.out.println("請輸入要查詢的學生姓名:");

            Scanner scanner2 = new Scanner(System.in);
            String name = scanner2.next();
            Student st = new Student();
            st.setId(null);
            st.setName(name);

            if(studentMap.containsValue(st)) {
                System.out.println("你輸入的學生姓名為：" + name + ", 已確認就在列表中！");
            } else {
                System.out.println("沒有找到此學生姓名");
            }

        } else {
            System.out.println("沒有找到此id");
        }


    }

    public static void main(String[] args) {
        MapTest mt = new MapTest();
        mt.putTest();
//        mt.keySetTest();
//        mt.removeTest();
//        mt.entrySetTest();
//        mt.fixedTest();
        mt.testContaindKeyOrValue();
    }
}
