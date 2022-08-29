package Adapter;

public class PrintBannerInher extends Banner implements Print{
    public PrintBannerInher(String string){
        super(string);
    }

    @Override
    public void printWeak() {
        this.showWithParen();
    }

    @Override
    public void printStrong() {
        this.showWithAster();
    }
}
