package enums;

//when we want fixed group of objects, use enum
public class Main {
    enum Week implements Interface{Monday, Tuesday, Wedenesday,Thrusday,Friday,Saturday,Sunday;
    //these are enum const
    //public static and final
    //since it's final can not create child enums
    //type is enum
        //abstract methods are not allowed here
    Week(){
        System.out.println("Constructor called for: " + this);
    }

        @Override
        public void hello() {
            System.out.println("Hello! How're you?");
        }
    }
    //will call for each const in enum Week
    //this is not public or protected, only private or default
    //why? because we don't want to create objects
    //internally it's something like: public static final Week Monday=new Week()
    public static void main(String[] args) {
        Week week=Week.Sunday;
        for (Week day:Week.values()
             ) {
            System.out.println(day);
        }
        System.out.println(Week.Sunday.ordinal());
        week.hello();
    }
}
