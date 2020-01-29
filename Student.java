

public class Student {

  private long id;
  private String name;

  public Student() {

  }

  public long getId(){
    return id;
  }

  public void setId(long id){
    id = id;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    name = name;
  }

  @Override
  public String toString(){
    return "id="+String.valueOf(id)+", name="+name;
  }

  public static void main(){
    System.out.println("hello student");
  }

}
