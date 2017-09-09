<?php
	$N=trim(fgets(STDIN));
	$count=0;
	while($N>0)
	{
		$ordered=str_split($N);
		asort($ordered);
		$M=join('', $ordered);
		$N=$N-$M;
		$count++;
	}
	print $count;
?>