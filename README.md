# MyBatis Integration with Spring Boot Sample

# 公式GitHub
https://github.com/mybatis/spring-boot-starter

# 動きを確認したVersion
- OpenJDK 11.0.9

# テスト実行するまで
### 1  `mybatis-sample` を git clone
```text
$ git clone https://github.com/sakuoden/mybatis-sample.git
```

### 2 DBサーバー起動
●●●は、上記1で `mybatis-sample` をcloneしたディレクトリ
```text
$ cd ●●●/mybatis-sample
```

```text
$ docker-compose up -d
```

### 3 テスト実行
上記2でmybatis-sampleディレクトリに移動している状態を前提
```text
./gradlew test
```
