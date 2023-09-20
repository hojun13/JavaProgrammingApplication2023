
public class Pikachu extends Pokemon{
    public Pikachu() {
        System.out.println("자식 클래스(피카츄)의 기본 생성자");
        this.level = 1;
        this.setHp(35);
        this.name = "피카츄";
        this.flyable = new NoFly(); // Association (Composition) <- has 관계(차를 한번에 파는거 따로 파는게 아닌)
                                    // (Aggregation) <-이건 부품 갈아끼는거
    }

    @Override
    public void attack() {
        //super.attack();
        System.out.println(this.name + "이(가) 광역 전기 장판 공격을 시전합니다");
    }
// 부모클래스의 정적 메서드 getPokemonCount가 override된게 아니라
// Pikachu 클래스의 자체 정적 메서드가 선언된 것
//    public static int getPokemonCount() {
//        return 7;
//    }

    public void type(){
        System.out.println(this.name +  " 전기 속성!");
    }
}