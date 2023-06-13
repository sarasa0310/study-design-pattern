package builder;

public class BuilderMain {

    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("text")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            System.out.println(textBuilder.getTextResult());
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            System.out.println("HTML 파일 " + htmlBuilder.getHTMLResult() + "이 작성되었습니다.");
        } else {
            usage();
            System.exit(0);
        }
    }

    private static void usage() {
        System.out.println("Usage: java BuilderMain text -> 텍스트로 문서 작성");
        System.out.println("Usage: java BuilderMain html -> HTML 파일로 문서 작성");
    }

}
