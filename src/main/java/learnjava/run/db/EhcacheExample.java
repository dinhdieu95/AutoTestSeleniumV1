package learnjava.run.db;

import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.CacheConfiguration;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
//import org.ehcache.core.EhcacheManagerBuilder;
import org.ehcache.expiry.Duration;
import org.ehcache.expiry.Expirations;

import java.util.concurrent.TimeUnit;

public class EhcacheExample {

    public static void main(String[] args) {
        // Tạo cache manager
        CacheManager cacheManager = CacheManagerBuilder.newCacheManagerBuilder()
                .build(true);

        // Định nghĩa cấu hình cache
        CacheConfiguration<String, String> cacheConfig = CacheConfigurationBuilder
                .newCacheConfigurationBuilder(String.class, String.class,
                        ResourcePoolsBuilder.heap(100))
                .withExpiry(Expirations.timeToLiveExpiration(Duration.of(10, TimeUnit.MINUTES)))// thời gian sống của mục trong cache
                .build();

        // Tạo cache với cấu hình đã định nghĩa
        Cache<String, String> cache = cacheManager.createCache("exampleCache", cacheConfig);

        // Lưu giá trị vào cache
        cache.put("key1", "test");

        // Truy xuất giá trị từ cache
        String value = cache.get("key1");
        System.out.println("Value: " + value);

        // Đóng cache manager khi không cần thiết nữa
        cacheManager.close();
    }
}
