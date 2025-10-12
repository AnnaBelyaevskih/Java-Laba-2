public class Pistolet {
    private int bulletCount;

    public int getBulletCount() {
        return bulletCount;
    }

    public void setBulletCount(int bulletCount) {
        Validator.validateNonNegative(bulletCount, "Количество патронов");
        this.bulletCount = bulletCount;
    }

    public Pistolet() {
        this.bulletCount = 5;
    }

    public Pistolet(int bulletCount) {
        setBulletCount(bulletCount);
    }

    public void shoot() {
        if (bulletCount > 0) {
            System.out.println("Бах!");
            bulletCount--;
        } else {
            System.out.println("Клац!");
        }
    }

    @Override
    public String toString() {
        return "Пистолет с " + bulletCount + " патронами";
    }

    public void shootMultipleTimes(int shots) {
        Validator.validateNonNegative(shots, "Количество выстрелов");
        System.out.println("Стрельба из пистолета:");
        for (int i = 0; i < shots; i++) {
            System.out.print("Выстрел " + (i + 1) + ": ");
            shoot();
        }
    }
}
