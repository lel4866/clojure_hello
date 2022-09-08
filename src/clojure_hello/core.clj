(ns clojure-hello.core
  (:require [java-time :as jt])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def a (conj args "grt"))
  (println a)
  a)

(-main "abc" "def")

(+ 3 54)

(jt/local-date)
(jt/local-time)
(jt/local-date-time)

