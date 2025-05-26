package access.hw2;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;
    int total;

    public void addItem(Item itemParameter) {
        if (itemCount < 10) {
            this.items[itemCount] = itemParameter;
            this.total += itemParameter.getTotalPrice();
            this.itemCount++;
        } else {
            System.out.println("장바구니가 가득 찼습니다.");
        }
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명: " + items[i].getName() + ", 합계: " + items[i].getTotalPrice());
        }
        System.out.println("전체 가격 합: " + this.total);
    }
}
