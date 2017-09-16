/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

public enum Numero {

    Uno {
        @Override
        public List<Integer> getList(int numero) {
            List<Integer> segmentoList = new ArrayList<>();
            segmentoList.add(3);
            segmentoList.add(4);
            return segmentoList;
        }

    },
    Dos {
        @Override
        public List<Integer> getList(int numero) {
            List<Integer> segmentoList = new ArrayList<>();
            segmentoList.add(5);
            segmentoList.add(3);
            segmentoList.add(6);
            segmentoList.add(2);
            segmentoList.add(7);
            return segmentoList;
        }

    },
    Tres {
        @Override
        public List<Integer> getList(int numero) {
            List<Integer> segmentoList = new ArrayList<>();
            segmentoList.add(5);
            segmentoList.add(3);
            segmentoList.add(6);
            segmentoList.add(4);
            segmentoList.add(7);
            return segmentoList;
        }
    },
    Cuatro {
        @Override
        public List<Integer> getList(int numero) {
            List<Integer> segmentoList = new ArrayList<>();
            segmentoList.add(1);
            segmentoList.add(6);
            segmentoList.add(3);
            segmentoList.add(4);
            return segmentoList;
        }

    },
    Cinco {
        @Override
        public List<Integer> getList(int numero) {
            List<Integer> segmentoList = new ArrayList<>();
            segmentoList.add(5);
            segmentoList.add(1);
            segmentoList.add(6);
            segmentoList.add(4);
            segmentoList.add(7);
            return segmentoList;
        }

    },
    Seis {
        @Override
        public List<Integer> getList(int numero) {
            List<Integer> segmentoList = new ArrayList<>();
            segmentoList.add(5);
            segmentoList.add(1);
            segmentoList.add(6);
            segmentoList.add(2);
            segmentoList.add(7);
            segmentoList.add(4);
            return segmentoList;
        }

    },
    Siete {
        @Override
        public List<Integer> getList(int numero) {
            List<Integer> segmentoList = new ArrayList<>();
            segmentoList.add(5);
            segmentoList.add(3);
            segmentoList.add(4);
            return segmentoList;
        }

    },
    Ocho {
        @Override
        public List<Integer> getList(int numero) {
            List<Integer> segmentoList = new ArrayList<>();
            segmentoList.add(1);
            segmentoList.add(2);
            segmentoList.add(3);
            segmentoList.add(4);
            segmentoList.add(5);
            segmentoList.add(6);
            segmentoList.add(7);
            return segmentoList;
        }

    },
    Nueve {
        @Override
        public List<Integer> getList(int numero) {
            List<Integer> segmentoList = new ArrayList<>();
            segmentoList.add(1);
            segmentoList.add(3);
            segmentoList.add(4);
            segmentoList.add(5);
            segmentoList.add(6);
            segmentoList.add(7);
            return segmentoList;
        }

    },
    Cero {
        @Override
        public List<Integer> getList(int numero) {
            List<Integer> segmentoList = new ArrayList<>();
            segmentoList.add(1);
            segmentoList.add(2);
            segmentoList.add(3);
            segmentoList.add(4);
            segmentoList.add(5);
            segmentoList.add(7);
            return segmentoList;
        }

    },;

    public abstract List<Integer> getList(int numero);

}
