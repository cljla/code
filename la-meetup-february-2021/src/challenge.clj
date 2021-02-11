(ns challenge)


(defn overlapping-rectangles [[{x1min :x, y1min :y} {x1max :x, y1max :y} :as r1]
                              [{x2min :x, y2min :y} {x2max :x, y2max :y} :as r2]]
  (let [xmin (max x1min x2min)
        xmax (min x1max x2max)
        ymin (max y1min y2min)
        ymax (min y1max y2max)]
    (* (max (- xmax xmin) 0)
       (max (- ymax ymin) 0))))

(overlapping-rectangles
  [{ :x 2, :y 1 }, { :x 5, :y 5 }],
  [{ :x 3, :y 2 }, { :x 5, :y 7}])
; 6

(overlapping-rectangles
  [{ :x 2, :y -9 }, { :x 13, :y -4 }],
  [{ :x 5, :y -11 }, { :x 7, :y -2}])
; 10

(overlapping-rectangles
  [{ :x -8, :y -7 }, { :x -4, :y 0 }],
  [{ :x -5, :y -9 }, { :x -1, :y -2}])
; 5
