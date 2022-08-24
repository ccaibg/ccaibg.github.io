    //增加对flv|avi|mkv|rm|wmv|mpg等几种视频格式的支持
    //private static final Pattern snifferMatch = Pattern.compile("http((?!http).){26,}?\\.(m3u8|mp4)\\?.*|http((?!http).){26,}\\.(m3u8|mp4)|http((?!http).){26,}?/m3u8\\?pt=m3u8.*|http((?!http).)*?default\\.ixigua\\.com/.*|http((?!http).)*?cdn-tos[^\\?]*|http((?!http).)*?/obj/tos[^\\?]*|http.*?/player/m3u8play\\.php\\?url=.*|http.*?/player/.*?[pP]lay\\.php\\?url=.*|http.*?/playlist/m3u8/\\?vid=.*|http.*?\\.php\\?type=m3u8&.*|http.*?/download.aspx\\?.*|http.*?/api/up_api.php\\?.*|https.*?\\.66yk\\.cn.*|http((?!http).)*?netease\\.com/file/.*");
    private static final Pattern snifferMatch = Pattern.compile("http((?!http).)*?default\\.365yg\\.com/.*|http((?!http).){26,}?\\.(m3u8|mp4|flv|avi|mkv|mov|3gp|asf|rm|rmvb|wmv|mpg|mpeg|mpe|ts|vob|m4a|mp3|wma)\\?.*|http((?!http).){26,}\\.(m3u8|mp4|flv|avi|mkv|mov|3gp|asf|rm|rmvb|wmv|mpg|mpeg|mpe|ts|vob|m4a|mp3|wma)|http((?!http).){26,}?/m3u8\\?pt=m3u8.*|http((?!http).)*?default\\.ixigua\\.com/.*|http((?!http).)*?cdn-tos[^\\?]*|http((?!http).)*?/obj/tos[^\\?]*|http.*?/player/m3u8play\\.php\\?url=.*|http.*?/player/.*?[pP]lay\\.php\\?url=.*|http.*?/playlist/m3u8/\\?vid=.*|http.*?\\.php\\?type=m3u8&.*|http.*?/download.aspx\\?.*|http.*?/api/up_api.php\\?.*|http.*?\\.66yk\\.cn.*|http((?!http).)*?netease\\.com/file/.*|http((?!http).)*?douyin\\.com/.*/play/\\?.*|http((?!http).)*?huoshan\\.com/.*/\\?item.*");
    public static boolean isVideoFormat(String url) {
        if (url.contains("=http") || url.contains("=https") || url.contains("=https%3a%2f") || url.contains("=http%3a%2f") || url.contains("baidu.com") || url.contains("6080kan.cc")) {
            return false;
        }
        if (snifferMatch.matcher(url).find()) {
            if (url.contains(".js") || url.contains(".css") || url.contains(".jpg") || url.contains(".png") || url.contains(".gif") || url.contains(".ico") || url.contains("rl=") || url.contains(".html")) {
                return false;
            }
            return true;
        }
        return false;
    }
