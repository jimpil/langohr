;; Copyright (c) 2011 Michael S. Klishin
;;
;; The use and distribution terms for this software are covered by the
;; Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;; which can be found in the file epl-v10.html at the root of this distribution.
;; By using this software in any fashion, you are agreeing to be bound by
;; the terms of this license.
;; You must not remove this notice, or any other, from this software.

(ns langohr.channel
  (:import (com.rabbitmq.client ConnectionFactory Connection Channel)))


;;
;; API
;;

(defn open
  "Opens a new channel on given connection using channel.open AMQP method"
  (^Channel [^Connection connection]
            (.createChannel connection))
  (^Channel [^Connection connection ^long channel-id]
            (.createChannel connection channel-id)))


(defn close
  "Closes given channel using channel.close AMQP method"
  [channel]
  (.close channel))
