package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }

    private static void hanoi(int n, char a, char b, char c) {
        if(n==0)return;
        hanoi(n-1,a,c,b);
        System.out.println(a+"-->"+c);
        hanoi(n-1,b,a,c);
    }

}
/*
                     hanoi(3, A, B, C)
                    /                 \
          hanoi(2, A, C, B)       hanoi(2, B, A, C)
           /          \             /          \
   hanoi(1,A,B,C)  hanoi(1,C,A,B)  hanoi(1,B,C,A)  hanoi(1,A,B,C)

                        hanoi(3)
                    /      |       \
              hanoi(2)    A→C     hanoi(2)
             /   |   \            /   |   \
        hanoi(1) A→B hanoi(1)  hanoi(1) B→C hanoi(1)


hanoi(3,A,B,C)
│
├── hanoi(2,A,C,B)
│   │
│   ├── hanoi(1,A,B,C)
│   │   move A → C
│   │
│   ├── move A → B
│   │
│   └── hanoi(1,C,A,B)
│       move C → B
│
├── move A → C
│
└── hanoi(2,B,A,C)
    │
    ├── hanoi(1,B,C,A)
    │   move B → A
    │
    ├── move B → C
    │
    └── hanoi(1,A,B,C)
        move A → C

 */
