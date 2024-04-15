package pratice;

public class Apart {
    public String name;
    public String address;
    public int constructYear;
    public int familyNumber;
    public boolean elevator;

    public Apart(String name,String address,int constructYear,int familyNumber,boolean elevator){
        this.name=name;
        this.address=address;
        this.constructYear=constructYear;
        this.familyNumber=familyNumber;
        this.elevator=elevator;
    }
    public void expalin(){
        System.out.println(name +"이라는 아파트가 있습니다." );
        System.out.println(address + " 에 있습니다.");
        when();
        System.out.println(familyNumber+" 가구수가 살고있습니다.");
        System.out.println(step(elevator));
    }
    public void when(){
        System.out.println(constructYear + " 년도에 지어졌습니다.");
    }
    public String step(boolean elevator){
        if(elevator) {
            return "엘레베이터의 유무: 유 ,엘레베이터를 타고 올라갑니다.";

        }else{
            return "엘레베이터의 유무: 무 ,걸어가야합니다";
        }

    }
}
