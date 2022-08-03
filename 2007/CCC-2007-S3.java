class Student{
    int id;
    Student friend = null;
    Student(int id){
      this.id = id;
    }
    
   
    public int isSameGroup(Student s){
        Student u = this.friend;
        ArrayList<Student> group = new ArrayList<Student>();
        group.add(this);
        int counter = 0;
        while(u != null){
            for(Student temp : group){
                if(temp.id == u.id){
                    return -1;
                }
            }
            
            if(u.id == s.id){
                return counter;
            }
           
            

            group.add(u);

            u = u.friend;
           
              counter ++;
                   
        }
        return -1;
    }
}
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
   
  
    public static void main(String[] args) throws IOException{
        //Student s1 = new Student(1);
        //Student s2 = new Student(2);
        int numStudents = readInt();
        HashMap<Integer,Student> map = new HashMap<Integer,Student>();
        for(int n=0;n<numStudents;n++){
            int id1 = readInt();
            int id2 = readInt();
            if(!map.containsKey(id1)){
                 map.put(id1, new Student(id1));
            }
            if(!map.containsKey(id2)){
                map.put(id2,new Student(id2));
            }

            map.get(id1).friend = map.get(id2); 
          
        }
        
        while(true){
            int id1 = readInt(), id2 = readInt();
            Student s1 = map.get(id1);
            Student s2 = map.get(id2);
            
            if(id1 == 0 && id2 == 0){
                break;
            }
      
            int separation = s1.isSameGroup(s2);
            if(separation == -1){
                System.out.println("No");
            }else{
                System.out.printf("Yes %d\n",separation);
            }
            
        }
  
    }
    
    //I deleted all the StringBuffer stuff bcos its redundant for the purposes of review

}
