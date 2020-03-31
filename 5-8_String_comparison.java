public class TestDemo{
    // 4. Method
    public static void main(String[] args){
        /** By using == to determine whether two strings are same or not IS WRONG! 
         *  It would be actually judging whether two "references" of those strings are same or not.
         *  If you want to do the former, use "equals".
        */
        String str1 = "abc";
        String str2 = "abc";
        // equals (string comparison)
        System.out.println(str1.equals(str2)); // false
        // ==     (reference comparison)
        System.out.println(str1 == str2); // false


        

        /** JSON means JavaScript Object Notation, it's an object expression in JavaScript
         *  Its {} means object, [] means array
         */

        /* ---------- HW - Try again ---------- */
        String json = "[{\"animal_id\":\"10305240201056\",\"animal_kind\":\"貓\",\"animal_sex\":\"F\",\"shelter_name\":\"臺北市動物之家\"},"
				+ "{\"animal_id\":\"10508011005002\",\"animal_kind\":\"狗\",\"animal_sex\":\"F\",\"shelter_name\":\"臺中市中途動物醫院\"}]";
        
        // 1. Dealing with this JSON string, to clean it First
        json = json.replace("[", "").replace("]", "").trim();

        // 2.   cat info   
        // 2-1. cat should be an array!
        String[] cat = new String[4]; // len of string array
        // 2-2. to get info about cat, by splitting/cleaning the json string
        int catStart = json.indexOf("{");
        int catEnd = json.indexOf("}") + 1;
        String catData = json.substring(catStart, catEnd).replace("{","").replace("}","");
        // 2-3. finally put these elements into array "cat"
        cat = catData.split(",");

        System.out.printf(cat[0]+"\n"+cat[1]+"\n"+cat[2]+"\n"+cat[3]+"\n");
        /**
         * "animal_id":"10305240201056"
         * "animal_kind":"貓"
         * "animal_sex":"F"
         * "shelter_name":"臺北市動物之家"
         */


        // 3.   dog info
        String[] dog = new String[4]; // len of string array
        // the rest is the same for cat


        /* ---------- HW ---------- */
        String json = "[{\"animal_id\":\"10305240201056\",\"animal_kind\":\"貓\",\"animal_sex\":\"F\",\"shelter_name\":\"臺北市動物之家\"},"
				+ "{\"animal_id\":\"10508011005002\",\"animal_kind\":\"狗\",\"animal_sex\":\"F\",\"shelter_name\":\"臺中市中途動物醫院\"}]";
        
        // cat info   
        String[] cat = json.split(",");
        System.out.println(cat[0].replace("[", "").replace("{", ""));
        // dog info
        String[] dog = json.split(",");
        System.out.println(dog[4].replace("{", ""));


        /* ---------- HW - Teacher's Solution ---------- */
        String json = "[{\"animal_id\":\"10305240201056\",\"animal_kind\":\"貓\",\"animal_sex\":\"F\",\"shelter_name\":\"臺北市動物之家\"},"
				+ "{\"animal_id\":\"10508011005002\",\"animal_kind\":\"狗\",\"animal_sex\":\"F\",\"shelter_name\":\"臺中市中途動物醫院\"}]";

        String[] cat = new String[4];
		String[] dog = new String[4];
		
		json = json.replace("[", "").replace("]", "");
		String catData = json.substring(json.indexOf("{"),json.indexOf("}")+1);
		String tmp = catData.replace("{", "").replace("}","");
		cat = tmp.split(",");
		
		String dogData = json.replace(catData+",", "");
		dogData = dogData.replace("{", "").replace("}","");
		dog = dogData.split(",");
		
		System.out.println(json);
		System.out.println(catData);
		System.out.println(dogData);
		System.out.println(cat[3]);
		System.out.println(dog[3]);
    }
}