(ns transit-bench.bench
  (:require [cheshire.core :as json]
            [clj-msgpack.core :as msgpack]
            [clojure.java.io :refer [reader resource input-stream output-stream]]
            [cognitect.transit :as transit]
            [criterium.core :refer :all])
  (:import [java.nio.file Files Paths]
           [java.io ByteArrayOutputStream])
  (:gen-class))

(defn read-bytes [file]
  (-> file resource (.toURI) (Paths/get) (Files/readAllBytes)))

(defn run-json []
  (let [small (read-bytes "small.json")
        large (read-bytes "large.json")]
    (println "=== JSON Small ===========================================")
    (quick-bench (json/parse-stream (reader small) true))
    (println "=== JSON Large ===========================================")
    (quick-bench (json/parse-stream (reader large) true))))

(defn run-msgpack []
  (let [small (read-bytes "small.pack")
        large (read-bytes "large.pack")]
    (println "=== MessagePack Small ====================================")
    (quick-bench (doall (msgpack/unpack small)))
    (println "=== MessagePack Large ====================================")
    (quick-bench (doall (msgpack/unpack large)))))

(defn run-transit-json []
  (let [small (read-bytes "small.tjson")
        large (read-bytes "large.tjson")]
    (println "=== Transit/JSON Small ===================================")
    (quick-bench (let [r (transit/reader (input-stream small) :json)]
                   (transit/read r)))
    (println "=== Transit/JSON Large ===================================")
    (quick-bench (let [r (transit/reader (input-stream large) :json)]
                   (transit/read r)))))

(defn run-transit-msgpack []
  (let [small (read-bytes "small.tpack")
        large (read-bytes "large.tpack")]
    (println "=== Transit/MessagePack Small ============================")
    (quick-bench (let [r (transit/reader (input-stream small) :msgpack)]
                   (transit/read r)))
    (println "=== Transit/MessagePack Large ============================")
    (quick-bench (let [r (transit/reader (input-stream large) :msgpack)]
                   (transit/read r)))))

(defn -main []
  (run-json)
  (run-msgpack)
  (run-transit-json)
  (run-transit-msgpack))
