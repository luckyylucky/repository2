class student
{
  int marks, rollno,percentage;
  string name;

student()
{
  marks=155;
}

void result(int a,int b)
{
  int c;
  c=a+b;
  marks=marks+c;
  percentage=(marks/300)*100;
  System.out.println(percentage);
}
 public static void main(String args[])
 {
  student ss=new student();
  ss.result(20,10);
 }

}