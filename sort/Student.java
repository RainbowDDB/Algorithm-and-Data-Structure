package sort;

class Student implements Comparable<Student> {
  String name;
  int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int compareTo(Student o) {
    if (o.age < this.age) {
      return 1;
    } else if (o.age > this.age) {
      return -1;
    } else {
      return this.name.compareTo(o.name);
    }
  }

  @Override
  public String toString() {
    return name+age;
  }
}