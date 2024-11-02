package baseball;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;

    public BaseBallTeam(String name, int win, int lose, int draw){
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //getRate メソッド 「勝ち数/(勝ち数+負け数)」小数値（double）で戻す
    public double getRate() {
        double winRate = (double) win / (win + lose);
        return winRate;
    }
    public void report() {
        System.out.println(name + "の2022年の成績は" + win +"勝" + lose + "敗" + draw + "分、勝率は" + getRate() + "です。");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWin() {
        return win;
    }
    public void setWin(int win) {
        this.win = win;
    }
    public int getLose() {
        return lose;
    }
    public void setLose(int lose) {
        this.lose = lose;
    }
    public int draw() {
        return draw;
    }
    public void setDraw(int draw) {
        this.draw = draw;
    }

}
