public class FileDownloader implements IDownloader{
    private final String userAgent;

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download(String URL, String target){
        System.out.println(
                "UserAgent: " + userAgent
                + "\nURL: " + URL
                + "\ntarget: " + target
        );
    }
}
