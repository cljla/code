(ns meetup)

((fn [x] (list x (list 'quote x)))
 '(fn [x] (list x (list 'quote x))))



((fn [x] (println (format "(%s %s)" x x))) "(fn [x] (println (format \"(%s %s) \" x x)))")
