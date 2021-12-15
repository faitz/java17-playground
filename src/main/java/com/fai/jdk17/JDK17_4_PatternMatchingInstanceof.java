package com.fai.jdk17;

public class JDK17_4_PatternMatchingInstanceof {

    interface Hewan {
        String getSuara();

        static void jalan(Hewan hewan){
            if(hewan instanceof Kucing kucing) {
                System.out.println("Kucing jalan: \"" + kucing.getSuara() + "\"");
            } else if(hewan instanceof Anjing anjing) {
                System.out.println("Anjing jalan: \"" + anjing.getSuara()+"\"");
            }
        }
    }

    record Kucing() implements Hewan {

        @Override
        public String getSuara() {
            return "Meong";
        }
    }

    record Anjing() implements Hewan {
        @Override
        public String getSuara() {
            return "Anjing";
        }
    }
}

