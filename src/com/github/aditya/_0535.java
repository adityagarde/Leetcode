package com.github.aditya;

import java.util.HashMap;
import java.util.Map;

public class _0535 {
    // 5 ms, faster than 57.86%, memory 42.5 MB, less than 79.95%
    public class Codec {
        Map<String, String> encodeMap = new HashMap<>();
        Map<String, String> decodeMap = new HashMap<>();
        static final String BASE_URL = "http://tinyurl.com/";

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            if (encodeMap.containsKey(longUrl))
                return encodeMap.get(longUrl);

            String shortUrl = BASE_URL + longUrl.hashCode();
            encodeMap.put(longUrl, shortUrl);
            decodeMap.put(shortUrl, longUrl);
            return shortUrl;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return decodeMap.get(shortUrl);
        }
    }

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
}