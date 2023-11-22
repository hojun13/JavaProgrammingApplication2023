package Pokemonster;

import fly.Flyable;

import java.util.ArrayList;
import java.util.Arrays;

public class Pikachu extends Pokemon{
    public Pikachu(Flyable f) {
        System.out.println("피카피카");
        this.level = 1;
        // this.attackRate = 55;
        this.attackRate = (int)(Math.random() * 6) + 50;
        this.defenceRate= 40;
        this.setHp(35);
        this.name = "피카츄";
//        this.skills = List.of(new String[]{"볼트테크", "아이언테일", "백만볼트"});
//        this.specialAttackRate = List.of(new Integer[]{90, 60,40});
//        this.skills = new ArrayList<>();
//        this.skills.add("백만볼트");
//        this.skills.add("아이언테일");
//        this.skills.add("백만볼트");
//        this.specialAttackRate = new ArrayList<>();
//        this.specialAttackRate.add(70);
//        this.specialAttackRate.add(30);
//        this.specialAttackRate.add(50);


        this.skills = new ArrayList<>(Arrays.asList("백만볼트","아이언테일","전광석화"));
        this.specialAttackRate = new ArrayList<>(Arrays.asList(60,50,20));

    //  this.flyable = new fly.NoFly(); // Association (Composition) <- Has-a 관계(차를 한번에 파는거 따로 파는게 아닌)
                                    // (Aggregation) <-이건 부품 갈아끼는거
        this.flyable = f;
    }


    @Override
    public void attack() {
        //super.attack();
        System.out.println(this.name + "이(가) 광역 전기 장판 공격을 시전합니다");
    }
// 부모클래스의 정적 메서드 getPokemonCount가 override된게 아니라
// Pokemonster.Pikachu 클래스의 자체 정적 메서드가 선언된 것
//    public static int getPokemonCount() {
//        return 7;
//    }

    public void type(){
        System.out.println(this.name +  " 전기 속성!");
    }
}
