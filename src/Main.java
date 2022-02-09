public class Main {

    public static void main(String[] args) {
        IDownloader downloader1 = new FileDownloaderProxy();
        IDownloader downloader2 = new FileDownloader("Chrome userAgent");

        downloader1.download("File1.txt", "Hoc tap/File1.txt");
        System.out.println();
        downloader2.download("File2.txt", "Cong viec/File2.txt");

    }
}
