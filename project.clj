(defproject transit-bench "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[cheshire "5.3.1"]
                 [clj-msgpack "0.2.0"]
                 [com.cognitect/transit-clj "0.8.259"]
                 [criterium "0.4.3"]
                 [org.clojure/clojure "1.6.0"]]
  :jvm-opts ^:replace ["-Xms1g" "-Xmx1g" "-server" "-XX:+AggressiveOpts" "-XX:+UseFastAccessorMethods"]
  :main transit-bench.bench
  :aot [transit-bench.bench])
