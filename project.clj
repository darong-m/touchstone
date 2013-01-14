(defproject com.taoensso/touchstone "0.11.0"
  :description "Clojure split-testing library"
  :url "https://github.com/ptaoussanis/touchstone"
  :license {:name "Eclipse Public License"}
  :dependencies [[org.clojure/clojure            "1.3.0"]
                 [org.clojure/tools.macro        "0.1.1"]
                 [com.taoensso/carmine           "1.1.0"]
                 [org.clojure/math.combinatorics "0.0.3"]]
  :profiles {:1.3   {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.4   {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5   {:dependencies [[org.clojure/clojure "1.5.0-alpha3"]]}
             :dev   {:dependencies []}
             :test  {:dependencies []}
             :bench {:dependencies []}}
  :aliases {"test-all" ["with-profile" "test,1.3:test,1.4:test,1.5" "test"]}
  :min-lein-version "2.0.0"
  :warn-on-reflection true)
