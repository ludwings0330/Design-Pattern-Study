package statepattern;


public class GumballMachine {
    final State soldOutState;
    final State noQuarterState;
    final State hasQuarterState;
    final State soldState;
    final State winnerState;

    State state;
    int count = 0;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }

        state = soldState;
    }

    // 동전이 투입된 경우
    public void insertQuarter() {
        state.insertQuarter();
    }

    // 사용자가 동전을 반환하려고하는 경우
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    // 손잡이를 돌리는 경우
    public void turnCrank() {
        state.turnCrank();
    }

    // 알맹이 꺼내기
    public void dispense() {
        state.dispense();
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setState(State state) {
        this.state = state;
    }
}
