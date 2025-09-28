public class Pistolet {
    private int bulletCount; // количество патронов

    public int getBulletCount() {
        return bulletCount;
    }

    public void setBulletCount(int bulletCount) {
        if (bulletCount < 0) {
            throw new IllegalArgumentException("Количество патронов не может быть отрицательным.");
        }
        this.bulletCount = bulletCount;
    }

    public Pistolet() {
        this.bulletCount = 5;
    }

    public Pistolet(int bulletCount) {
        setBulletCount(bulletCount);
    }

    //метод "стрелять"
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

    //метод для стрельбы с указанным количеством выстрелов
    public void shootMultipleTimes(int shots) {
        if (shots < 0) {
            throw new IllegalArgumentException("Количество выстрелов не может быть отрицательным.");
        }

        System.out.println("Стрельба из пистолета:");
        for (int i = 0; i < shots; i++) {
            System.out.print("Выстрел " + (i + 1) + ": ");
            shoot();
        }
    }
}
