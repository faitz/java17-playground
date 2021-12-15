package com.fai.jdk17;

public class JDK17_3_SwitchExpression {

    public static void main(String[] args) {
        final Hari senin = Hari.SENIN;

        switch (senin) {
            case SENIN:
                System.out.println("Senin");
            case SABTU:
            case MINGGU:
                System.out.println("Hari libur");
            default:
                throw new IllegalStateException("Error");

        }
    }


    enum Hari{SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU}

    public static boolean isHariLiburJava8SwitchStatement(Hari hari){
        boolean hariLibur = false;
        switch (hari) {
            case SENIN:
            case SELASA:
            case RABU:
            case KAMIS:
            case JUMAT:
                hariLibur = false;
                break;
            case SABTU:
            case MINGGU:
                hariLibur = true;
                break;
            default:
                throw new IllegalStateException("Salah hari");
        }
        return hariLibur;
    }

    public static boolean isHariLiburJava17SwitchExpression(Hari hari){
        return switch (hari) {
            case SENIN, SELASA, RABU, KAMIS, JUMAT -> false;
            case SABTU, MINGGU -> {
                System.out.println("Logging dahulu");
                yield true;
            }
            default -> throw new IllegalStateException("Salah hari");
        };
    }

    public static boolean isHariLiburJava17SwitchExpression2(Hari hari){
        var hariLibur = switch (hari) {
            case SENIN, SELASA, RABU, KAMIS, JUMAT -> false;
            case SABTU, MINGGU -> {
                System.out.println("Logging dahulu");
                yield true;
            }
            default -> throw new IllegalStateException("Salah hari");
        };

        System.out.println("Hari libur: "+hariLibur);
        return hariLibur;
    }

    public static void isHariLiburJava17SwitchExpression3(Hari hari){
        System.out.println (switch (hari) {
            case SENIN, SELASA, RABU, KAMIS, JUMAT -> false;
            case SABTU, MINGGU -> {
                System.out.println("Logging dahulu");
                yield true;
            }
            default -> throw new IllegalStateException("Salah hari");
        } );

    }
}

