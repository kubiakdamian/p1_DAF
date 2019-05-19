package pl.qbsapps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DFA {
    private int row = 0;
    private int column = 0;
    private Scanner scanner = new Scanner(System.in);
    private List<State> transitions = new ArrayList<>();

    public void run() {
        System.out.println("Wprowadź wartość:");
        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();

            if (input == 1 || input == 2 || input == 5) {
                if (performAppropriateOperation(input)) {
                    System.out.println("Przebieg stanów:");
                    printTransitions();
                    return;
                }
            } else {
                System.out.println("Wprowadzono złą wartosć");
            }
        }
    }

    private boolean performAppropriateOperation(int coin) {
        switch (coin) {
            case 1:
                column = 0;
                break;

            case 2:
                column = 1;
                break;

            case 5:
                column = 2;
                break;
        }

        State currentState = TransitionTable.table[row][column];
        transitions.add(currentState);
        row = currentState.getValue();
        System.out.println(currentState.getText());

        return currentState.isEnding();
    }

    private void printTransitions() {
        for (State state : transitions) {
            System.out.println(state.getText());
        }
    }
}
