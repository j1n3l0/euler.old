#!/usr/bin/env perl
# http://projecteuler.net/index.php?section=problems&id=1
# ------------------------------------------------------------------
# If we list all the natural numbers below 10 that are multiples
# of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
# Find the sum of all the multiples of 3 or 5 below 1000.
# ------------------------------------------------------------------
use Modern::Perl;
use signatures;
use List::Util 'sum';

sub sum_multiples {
    sum grep { $_ % 3 == 0 || $_ % 5 == 0 } @_;
}
say {*STDOUT} 'Sum of multiples of 3 and 5 below 1000: ',
    sum_multiples( 1 .. 999 );

sub sum_of_multiples($n, $t) {
    $n * sum( 1 .. int( $t / $n ) );
}

say {*STDOUT}
    sum_of_multiples( 3,  999 )
  + sum_of_multiples( 5,  999 )
  - sum_of_multiples( 15, 999 );
