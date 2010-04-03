-- problem-009.hs

problem_009 :: Integer
problem_009 = head [ a*b*c | c <- [1..500], b <- [1..c], a <- [1..b], a^2 + b^2 == c^2, a+b+c == 1000 ]
