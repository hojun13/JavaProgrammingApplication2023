package Pokemonster;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Squirtle extends Pokemon{
    public Squirtle(Flyable f) {
        super();  // 부모 클래스의 기본 생성자 호출 (생략 가능)
        System.out.println("꼬북꼬북");
        //this.setLevel(1);
        this.level = 1;
//        this.attackRate=48;
        this.attackRate = (int)(Math.random() * 4) + 45;
        this.defenceRate=65;
        this.setHp(44);
//        this.skills = List.of(new String[]{"웅크리기", "헤엄치기", "하이드로펌프"});
//        this.specialAttackRate = List.of(new Integer[]{90, 60,40});
        this.name = "꼬부기";
//        this.skills = new ArrayList<>();
//        this.skills.add("웅크리기");
//        this.skills.add("헤엄치기");
//        this.skills.add("하이드로펌프");
//        this.specialAttackRate = new ArrayList<>();
//        this.specialAttackRate.add(0);
//        this.specialAttackRate.add(10);
//        this.specialAttackRate.add(70);
//        this.flyable = f; // Association, has-a ( Aggregation )
        this.skills = new ArrayList<>(Arrays.asList("웅크리기","헤엄치기","하이드로펌프"));
        this.specialAttackRate = new ArrayList<>(Arrays.asList(0,10,100));
    }

    @Override
    public void attack() {
        System.out.println(this.name + "이(가) 광역 물대포 공격을 시전합니다");
    }
}
