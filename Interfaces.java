import java.lang.String;
interface action{
void display();
}
class person implements action{
public void display(){
System.out.println("Hello Rishab ");
}
}
class main{
public static void main(String[] args){
person p = new person();
p.display();
}
}