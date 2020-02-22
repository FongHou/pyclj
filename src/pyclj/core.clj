(ns pyclj.core
   (:require [libpython-clj.python :as py :refer [py. py.. py.- py*]]
             [libpython-clj.python.object]
             [libpython-clj.require :refer [require-python]]))

(swap! libpython-clj.python.object/object-reference-logging (constantly true))

(require-python '[torch :bind-ns :as th])
(require-python '[numpy :bind-ns :as np])

(defn -main [& _]
  (println "hello, world!"))

