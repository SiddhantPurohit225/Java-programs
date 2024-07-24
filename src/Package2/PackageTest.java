package Package2;

public  class PackageTest {
// defalt method:
public   void abcd()
    {
        System.out.println("hello this is child class of the pak2");
    }
}

class child extends PackageTest{
    public void abc()
    {
        // can be accessed within the class
        abcd();
        System.out.println("hello this is child class of the pak2");
    }
}

 class  Randdom{
    public void randpp(){
        PackageTest nw=new PackageTest();
        nw.abcd();
    }
}
