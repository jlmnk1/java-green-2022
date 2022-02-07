package coffeeshop;

import java.util.ArrayList;
import java.util.List;

class 손님 {
    private String name = "홍길동";

    public void order(String menuName, 메뉴판 menu, 바리스타 barista) {
        메뉴아이템 menuItem = menu.choose(menuName);
        커피 coffee = 바리스타.makeCoffee(menuItem);
        System.out.println(name + "이(가) " + coffee.getPrice() + "원 " + coffee.getName() + "를 받았습니다.");
    }

    public String getName() {
        return name;
    }

}

class 메뉴판 {
    private List<메뉴아이템> items;

    public 메뉴판(List<메뉴아이템> items) {
        this.items = items;
    }

    public 메뉴아이템 choose(String name) {
        for (메뉴아이템 each : items) {
            if (each.getName().equals(name)) {
                return each;
            }
        }
        return null;
    }
}

class 메뉴아이템 {
    private String name;
    private int price;

    public 메뉴아이템(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return this.name;
    }
}

class 바리스타 {
    private String name = "공유";

    public static 커피 makeCoffee(메뉴아이템 menuItem) {
        커피 coffee = new 커피(menuItem);
        return coffee;
    }

    public String getName() {
        return name;
    }
}

class 커피 {
    private String name;
    private int price;

    public 커피(메뉴아이템 menuItem) {
        this.name = menuItem.getName();
        this.price = menuItem.getPrice();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

public class CoffeeShop {
    public static void main(String[] args) {
        손님 user = new 손님();
        바리스타 barista = new 바리스타();

        메뉴아이템 menu1 = new 메뉴아이템("아메리카노", 1500);
        메뉴아이템 menu2 = new 메뉴아이템("카페라떼", 2500);
        메뉴아이템 menu3 = new 메뉴아이템("바닐라라떼", 3500);
        메뉴아이템 menu4 = new 메뉴아이템("카페모카", 2500);
        List<메뉴아이템> list = new ArrayList<>();

        list.add(menu1);
        list.add(menu2);
        list.add(menu3);
        list.add(menu4);

        메뉴판 menu = new 메뉴판(list);

        user.order("바닐라라떼", menu, barista);
    }
}
