package kosa.dataa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

    public static void main(String[] args) {
        //Map (key,value), (key,value)... => HashMap
        Map<String, String> map = new HashMap<String, String>();

        map.put("1", "KIA");  // Map에서 값 추가 하는 방법
        map.put("2", "LG");
        map.put("3", "Samsung");

        System.out.println("요소의 사이즈 : " + map.size());  // Map에서 사이즈 크기 아는 방법

        if(map.containsKey("LG")) {  // Map에서 특정 요소 삭제
            map.remove("2");
        }

        System.out.println("요소의 사이즈 : " + map.size());
        System.out.println("삼성팀 : " + map.get("3"));  // Map의 값을 가져오는 방법

        //Map 전체목록 출력(key, value) ; key 없이
        //Map => Set => Iterator
        //key => keySet() : Set
        //value => values : Collection
        //(key, value) => entrySet() : Set

        Set set = map.entrySet();

        Iterator iter = set.iterator();

        while(iter.hasNext()) {
            Map.Entry<String, String> e = (Map.Entry<String, String>)iter.next();  // 내부 데이터
            System.out.println("key: " + e.getKey() + ", value: " + e.getValue());
        }
    }
}
