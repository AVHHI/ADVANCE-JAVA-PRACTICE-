class students{
    String name;

    students(){                 // constructor
        name = "avhi";
        
    }
}

class Constructor{
    public static void main(String[] args){
        students s = new students();
        System.out.println(s.name);
    }
}
