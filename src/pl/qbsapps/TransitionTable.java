package pl.qbsapps;

public class TransitionTable {
    public static State[][] table = {
            {State.Q1, State.Q2, State.Q5},
            {State.Q2, State.Q3, State.Q6},
            {State.Q3, State.Q4, State.Q7},
            {State.Q4, State.Q5, State.Q8},
            {State.Q5, State.Q6, State.Q9},
            {State.Q5, State.Q5, State.Q5},
            {State.Q6, State.Q6, State.Q6},
            {State.Q7, State.Q7, State.Q7},
            {State.Q8, State.Q8, State.Q8},
            {State.Q9, State.Q9, State.Q9}
    };
}
