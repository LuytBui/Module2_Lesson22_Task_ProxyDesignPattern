public class FileDownloaderProxy implements IDownloader{
    private final IDownloader downloader;

    public FileDownloaderProxy() {
        this.downloader = new FileDownloader("Firefox userAgent");
    }

    public void download(String URL, String target){
        downloader.download(URL, target);
    }
}
